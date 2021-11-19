package net.ptnetwork.court.mapper;

import net.ptnetwork.court.domain.Unit;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author cyh
 * @date 2021-11-10
 */
@Repository
public interface UnitMapper extends BaseMapper<Unit> {

    // 单位登录
    List<Unit> UnitLogin(@RequestBody Unit unit);

    // 获取单位信息
    List<Unit> GetUnit(@RequestBody Unit unit);

}
