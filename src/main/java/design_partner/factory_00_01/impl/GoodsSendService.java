package design_partner.factory_00_01.impl;

import design_partner.factory_00_01.ISend;
import design_partner.factory_00_01.model.SendReq;
import design_partner.factory_00_01.model.SendRsp;

/**
 * @author liusy
 * @since 2021/8/27下午8:47
 */
public class GoodsSendService implements ISend {
    @Override
    public SendRsp doSend(SendReq req) {
        SendRsp rsp = new SendRsp();
        rsp.setResult("send Goods success!");
        return rsp;
    }
}
