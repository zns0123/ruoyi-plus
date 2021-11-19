package net.ptnetwork.court.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.ptnetwork.court.domain.Synergy;
import net.ptnetwork.court.mapper.SynergyMapper;
import net.ptnetwork.court.service.ISynergyService;

import java.util.List;


/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author cyh
 * @date 2021-11-10
 */
@Service
public class SynergyServiceImpl extends ServiceImpl<SynergyMapper, Synergy> implements ISynergyService {

    @Autowired
    private SynergyMapper synergyMapper;

    // 获取协同列表
    @Override
    public List<Synergy> GetSynergy() {
        return synergyMapper.GetSynergy();
    }

    // 查询协同（根据案件名模糊查询）
    @Override
    public List<Synergy> QuerySynergy(Synergy synergy) {
        return synergyMapper.QuerySynergy(synergy);
    }

    // 选择并查看协同详情（根据协同id查询）
    @Override
    public List<Synergy> SelectSynergy(Synergy synergy) {
        return synergyMapper.SelectSynergy(synergy);
    }

    // 获取待发协同列表
    @Override
    public List<Synergy> WaitSynergy(Synergy synergy) {
        return synergyMapper.WaitSynergy(synergy);
    }
}
