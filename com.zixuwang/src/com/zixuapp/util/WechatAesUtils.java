package com.zixuapp.util;

import com.zixuapp.wechat.aes.WXBizMsgCrypt;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class WechatAesUtils {
    public static String encode(String encodingAesKey, String token, String appId, String replyMsg, String timestamp, String nonce) {
        try {
            WXBizMsgCrypt wxBizMsgCrypt = new WXBizMsgCrypt(token, encodingAesKey, appId);
            String encode = wxBizMsgCrypt.encryptMsg(replyMsg, timestamp, nonce);
            return encode;
        } catch (Exception e) {
            return null;
        }
    }

    public static String decode(String encodingAesKey, String token, String appId, String fromXML, String msgSignature, String timeStamp, String nonce) {
        try {

            Document document = null;
            Element xmlDom = null;
            try {
                document = DocumentHelper.parseText(fromXML);
                xmlDom = document.getRootElement();
            } catch (DocumentException e) {
                return null;
            }
            Element encryptDom = xmlDom.element("Encrypt");
            if (encryptDom == null) {
                return null;
            }
            String encrypt = encryptDom.getText();
            String format = "<xml><ToUserName><![CDATA[toUser]]></ToUserName><Encrypt><![CDATA[%1$s]]></Encrypt></xml>";
            String formatToXML = String.format(format, encrypt);
            WXBizMsgCrypt wxBizMsgCrypt = new WXBizMsgCrypt(token, encodingAesKey, appId);
            return wxBizMsgCrypt.decryptMsg(msgSignature, timeStamp, nonce, formatToXML);
        } catch (Exception e) {
            return null;
        }
    }
}
