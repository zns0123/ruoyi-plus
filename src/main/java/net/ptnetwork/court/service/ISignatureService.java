package net.ptnetwork.court.service;

import net.ptnetwork.court.domain.Signature;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Collection;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author cyh
 * @date 2021-11-10
 */
public interface ISignatureService extends IService<Signature> {

    // 获取签章列表
    List<Signature> GetSignature();

    // 选择并查看签章详情（根据签章id查询）
    List<Signature> SelectSignature(Signature signature);

}
