package net.ptnetwork.court.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.ptnetwork.court.domain.Signature;
import net.ptnetwork.court.mapper.SignatureMapper;
import net.ptnetwork.court.service.ISignatureService;

import java.util.List;


/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author cyh
 * @date 2021-11-10
 */
@Service
public class SignatureServiceImpl extends ServiceImpl<SignatureMapper, Signature> implements ISignatureService {

    @Autowired
    private SignatureMapper signatureMapper;

    // 获取签章列表
    @Override
    public List<Signature> GetSignature() {
        return signatureMapper.GetSignature();
    }

    // 选择并查看签章详情（根据签章id查询）
    @Override
    public List<Signature> SelectSignature(Signature signature) {
        return signatureMapper.SelectSignature(signature);
    }
}
