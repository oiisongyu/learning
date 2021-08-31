package design_partner.factory_00_01;

import design_partner.factory_00_01.model.SendReq;
import design_partner.factory_00_01.model.SendRsp;

/**
 * @author liusy
 * @since 2021/8/27下午8:46
 * send行为接口
 */
public interface ISend {
    SendRsp doSend(SendReq req);
}
