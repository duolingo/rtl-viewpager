/**
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

    public DelegatingPagerAdapter(@NonNull final PagerAdapter mDelegate) {
        this.mDelegate = mDelegate;
    }

    @NonNull
    public PagerAdapter getDelegate() {
        return mDelegate;
    }

    public int getCount() {
        return mDelegate.getCount();
    }

    public void startUpdate(ViewGroup container) {
        mDelegate.startUpdate(container);
    }

    public Object instantiateItem(ViewGroup container, int position) {
        return mDelegate.instantiateItem(container, position);
    }

    public void destroyItem(ViewGroup container, int position, Object object) {
        mDelegate.destroyItem(container, position, object);
    }

    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        mDelegate.setPrimaryItem(container, position, object);
    }

    public void finishUpdate(ViewGroup container) {
        mDelegate.finishUpdate(container);
    }

    @Deprecated
    public void startUpdate(View container) {
        mDelegate.startUpdate(container);
    }

    @Deprecated
    public Object instantiateItem(View container, int position) {
        return mDelegate.instantiateItem(container, position);
    }

    @Deprecated
    public void destroyItem(View container, int position, Object object) {
        mDelegate.destroyItem(container, position, object);
    }

    @Deprecated
    public void setPrimaryItem(View container, int position, Object object) {
        mDelegate.setPrimaryItem(container, position, object);
    }

    @Deprecated
    public void finishUpdate(View container) {
        mDelegate.finishUpdate(container);
    }

    public boolean isViewFromObject(View view, Object object) {
        return mDelegate.isViewFromObject(view, object);
    }

    public Parcelable saveState() {
        return mDelegate.saveState();
    }

    public void restoreState(Parcelable state, ClassLoader loader) {
        mDelegate.restoreState(state, loader);
    }

    public int getItemPosition(Object object) {
        return mDelegate.getItemPosition(object);
    }

    public void notifyDataSetChanged() {
        mDelegate.notifyDataSetChanged();
    }

    public void registerDataSetObserver(DataSetObserver observer) {
        mDelegate.registerDataSetObserver(observer);
    }

    public void unregisterDataSetObserver(DataSetObserver observer) {
        mDelegate.unregisterDataSetObserver(observer);
    }

    public CharSequence getPageTitle(int position) {
        return mDelegate.getPageTitle(position);
    }

    public float getPageWidth(int position) {
        return mDelegate.getPageWidth(position);
    }
}
