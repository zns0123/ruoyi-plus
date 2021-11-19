package net.ptnetwork.court.service.impl;

import net.ptnetwork.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.ptnetwork.court.domain.Unit;
import net.ptnetwork.court.mapper.UnitMapper;
import net.ptnetwork.court.service.IUnitService;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author cyh
 * @date 2021-11-10
 */
@Service
public class UnitServiceImpl extends ServiceImpl<UnitMapper, Unit> implements IUnitService {

    @Autowired
    private UnitMapper unitMapper;

    // 单位登录
    @Override
    public List<Unit> UnitLogin(Unit unit) {
        return unitMapper.UnitLogin(unit);
    }

    // 获取单位信息
    @Override
    public List<Unit> GetUnit(Unit unit) {
        return unitMapper.GetUnit(unit);
    }
}
