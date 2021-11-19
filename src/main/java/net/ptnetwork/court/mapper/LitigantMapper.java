package net.ptnetwork.court.mapper;

import net.ptnetwork.court.domain.Litigant;
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
public interface LitigantMapper extends BaseMapper<Litigant> {

    // 展示当事人信息（通过案号）
    List<Litigant> ShowLitigant(Litigant litigant);

}
