package net.ptnetwork.court.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.ptnetwork.court.domain.Litigant;
import net.ptnetwork.court.mapper.LitigantMapper;
import net.ptnetwork.court.service.ILitigantService;

import java.util.List;


/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author cyh
 * @date 2021-11-10
 */
@Service
public class LitigantServiceImpl extends ServiceImpl<LitigantMapper, Litigant> implements ILitigantService {

    @Autowired
    private LitigantMapper litigantMapper;

    // 展示当事人信息（通过案号）
    @Override
    public List<Litigant> ShowLitigant(Litigant litigant) {
        return litigantMapper.ShowLitigant(litigant);
    }
}
