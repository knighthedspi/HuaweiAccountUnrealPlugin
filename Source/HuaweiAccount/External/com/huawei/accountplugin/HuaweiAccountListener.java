package com.huawei.accountplugin;

import com.huawei.hms.support.account.result.AuthAccount;

public interface HuaweiAccountListener {
    void onLoggedIn(AuthAccount account);
    void onGetIdToken(String idToken);
    void onGetAuthCode(String authCode);
    void onLoggedOut();
    void onCancelledAuth();
    void onException(int action, String message);
}