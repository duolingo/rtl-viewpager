# RtlViewPager
`RtlViewPager` is built on top of `ViewPager` which is provided as part of the
[AndroidX](https://developer.android.com/jetpack/androidx).
It extends the functionality of `ViewPager` such that when the layout direction is right to left, pages scroll accordingly.
`RtlViewPager` fully supports data set changes, interoperation with tab strips, and saving and restoring state on screen rotation
and other configuration changes.  Although RTL support has been present as part of Android since version 4.2, the `ViewPager`
implementation in the support library does not.

## Preview

![Duolingo home, English UI](docs/images/rtl-viewpager-en-home.gif)
![Duolingo home, Arabic UI](docs/images/rtl-viewpager-ar-home.gif)

## Usage
```groovy
dependencies {
    implementation 'androidx.viewpager:viewpager:1.0.0'
    implementation 'com.duolingo.open:rtl-viewpager:2.0.0'
}
```
[ ![Download](https://api.bintray.com/packages/duolingo/maven/com.duolingo.open%3Artl-viewpager/images/download.svg) ](https://bintray.com/duolingo/maven/com.duolingo.open%3Artl-viewpager/_latestVersion)

[![Version Notifications](https://www.bintray.com/docs/images/bintray_badge_bw.png)](https://bintray.com/duolingo/maven/RtlViewPager?source=watch)

## Contributing

Please read our [contributing guidelines](CONTRIBUTING.md).

## License

> Copyright 2016–2020 Duolingo
>
> Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
>
> http://www.apache.org/licenses/LICENSE-2.0
>
> Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

A copy of the license is also available in the [license file](LICENSE).

_Duolingo is hiring! Apply at https://www.duolingo.com/careers_
