/*
 * Copyright 2016 Duolingo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duolingo.open.rtlviewpager;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class DelegatingPagerAdapter extends PagerAdapter {

    @NonNull
    private final PagerAdapter mDelegate;

    DelegatingPagerAdapter(@NonNull final PagerAdapter delegate) {
        this.mDelegate = delegate;
        delegate.registerDataSetObserver(new MyDataSetObserver(this));
    }

    @NonNull
    PagerAdapter getDelegate() {
        return mDelegate;
    }

    public int getCount() {
        return mDelegate.getCount();
    }

    public void startUpdate(@NonNull ViewGroup container) {
        mDelegate.startUpdate(container);
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        return mDelegate.instantiateItem(container, position);
    }

    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        mDelegate.destroyItem(container, position, object);
    }

    public void setPrimaryItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        mDelegate.setPrimaryItem(container, position, object);
    }

    public void finishUpdate(@NonNull ViewGroup container) {
        mDelegate.finishUpdate(container);
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return mDelegate.isViewFromObject(view, object);
    }

    public Parcelable saveState() {
        return mDelegate.saveState();
    }

    public void restoreState(Parcelable state, ClassLoader loader) {
        mDelegate.restoreState(state, loader);
    }

    public int getItemPosition(@NonNull Object object) {
        return mDelegate.getItemPosition(object);
    }

    public void notifyDataSetChanged() {
        mDelegate.notifyDataSetChanged();
    }

    public void registerDataSetObserver(@NonNull DataSetObserver observer) {
        mDelegate.registerDataSetObserver(observer);
    }

    public void unregisterDataSetObserver(@NonNull DataSetObserver observer) {
        mDelegate.unregisterDataSetObserver(observer);
    }

    public CharSequence getPageTitle(int position) {
        return mDelegate.getPageTitle(position);
    }

    public float getPageWidth(int position) {
        return mDelegate.getPageWidth(position);
    }

    private void superNotifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    private static class MyDataSetObserver extends DataSetObserver {
        final DelegatingPagerAdapter mParent;

        private MyDataSetObserver(DelegatingPagerAdapter mParent) {
            this.mParent = mParent;
        }

        @Override
        public void onChanged() {
            if (mParent != null) {
                mParent.superNotifyDataSetChanged();
            }
        }

        @Override
        public void onInvalidated() {
            onChanged();
        }
    }
}
