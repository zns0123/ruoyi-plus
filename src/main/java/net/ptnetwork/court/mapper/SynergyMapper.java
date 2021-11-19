package net.ptnetwork.court.mapper;

import net.ptnetwork.court.domain.LawCase;
import net.ptnetwork.court.domain.Synergy;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author cyh
 * @date 2021-11-10
 */
@Repository
public interface SynergyMapper extends BaseMapper<Synergy> {

    // 获取协同列表
    List<Synergy> GetSynergy();

    // 查询协同（根据案件名模糊查询）
    List<Synergy> QuerySynergy(Synergy synergy);

    // 选择并查看协同详情（根据协同id查询）
    List<Synergy> SelectSynergy(Synergy synergy);

    // 获取待发协同列表
    List<Synergy> WaitSynergy(Synergy synergy);

}
