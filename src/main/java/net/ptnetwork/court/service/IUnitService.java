package net.ptnetwork.court.service;

import net.ptnetwork.common.core.domain.AjaxResult;
import net.ptnetwork.court.domain.Unit;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author cyh
 * @date 2021-11-10
 */
public interface IUnitService extends IService<Unit> {

    // 单位登录
    List<Unit> UnitLogin(@RequestBody Unit unit);

    // 获取单位信息
    List<Unit> GetUnit(@RequestBody Unit unit);

}
