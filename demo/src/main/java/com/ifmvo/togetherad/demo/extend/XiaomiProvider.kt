package com.ifmvo.togetherad.demo.extend

import android.app.Activity
import android.view.ViewGroup
import com.ifmvo.togetherad.core.listener.*
import com.ifmvo.togetherad.core.provider.BaseAdProvider

/**
 * 自定义小米广告提供商
 *
 * 根据其他 Provider 可自行实现广告请求逻辑
 *
 * Created by Matthew Chen on 2020/10/23.
 */
class XiaomiProvider: BaseAdProvider() {

    override fun loadOnlySplashAd(activity: Activity, adProviderType: String, alias: String, listener: SplashListener) {
        callbackSplashFailed(adProviderType, listener, "小米开屏不支持加载和展示分开")
    }

    override fun showSplashAd(container: ViewGroup): Boolean {
        return false
    }

    override fun loadAndShowSplashAd(activity: Activity, adProviderType: String, alias: String, container: ViewGroup, listener: SplashListener) {}

    override fun showBannerAd(activity: Activity, adProviderType: String, alias: String, container: ViewGroup, listener: BannerListener) {}

    override fun destroyBannerAd() {}

    override fun requestInterAd(activity: Activity, adProviderType: String, alias: String, listener: InterListener) {}

    override fun showInterAd(activity: Activity) {}

    override fun destroyInterAd() {}

    override fun getNativeAdList(activity: Activity, adProviderType: String, alias: String, maxCount: Int, listener: NativeListener) {}

    override fun nativeAdIsBelongTheProvider(adObject: Any): Boolean { return false }

    override fun resumeNativeAd(adObject: Any) {}

    override fun pauseNativeAd(adObject: Any) {}

    override fun destroyNativeAd(adObject: Any) {}

    override fun requestRewardAd(activity: Activity, adProviderType: String, alias: String, listener: RewardListener) {}

    override fun showRewardAd(activity: Activity) {}
}