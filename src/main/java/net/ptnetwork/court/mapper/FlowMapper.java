package net.ptnetwork.court.mapper;

import net.ptnetwork.court.domain.Flow;
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
public interface FlowMapper extends BaseMapper<Flow> {

    // 获取流程日志列表
    List<Flow> GetFlow();

}
