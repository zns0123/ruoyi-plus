package net.ptnetwork.system.service.impl;

import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.ptnetwork.system.domain.SysLogininfor;
import net.ptnetwork.system.mapper.SysLogininforMapper;
import net.ptnetwork.system.service.ISysLogininforService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 系统访问日志情况信息 服务层处理
 *
 * @author ruoyi
 */
@Service
public class SysLogininforServiceImpl extends ServiceImpl<SysLogininforMapper, SysLogininfor> implements ISysLogininforService {

    /**
     * 新增系统登录日志
     *
     * @param logininfor 访问日志对象
     */
    @Override
    public void insertLogininfor(SysLogininfor logininfor) {
        logininfor.setLoginTime(new Date());
        save(logininfor);
    }

    /**
     * 查询系统登录日志集合
     *
     * @param logininfor 访问日志对象
     * @return 登录记录集合
     */
    @Override
    public List<SysLogininfor> selectLogininforList(SysLogininfor logininfor) {
        Map<String, Object> params = logininfor.getParams();
        return list(new LambdaQueryWrapper<SysLogininfor>()
                .like(StrUtil.isNotBlank(logininfor.getIpaddr()),SysLogininfor::getIpaddr,logininfor.getIpaddr())
                .eq(StrUtil.isNotBlank(logininfor.getStatus()),SysLogininfor::getStatus,logininfor.getStatus())
                .like(StrUtil.isNotBlank(logininfor.getUserName()),SysLogininfor::getUserName,logininfor.getUserName())
                .apply(Validator.isNotEmpty(params.get("beginTime")),
                        "date_format(login_time,'%y%m%d') &gt;= date_format({0},'%y%m%d')",
                        params.get("beginTime"))
                .apply(Validator.isNotEmpty(params.get("endTime")),
                        "date_format(login_time,'%y%m%d') &lt;= date_format({0},'%y%m%d'",
                        params.get("endTime"))
                .orderByDesc(SysLogininfor::getInfoId));
    }

    /**
     * 批量删除系统登录日志
     *
     * @param infoIds 需要删除的登录日志ID
     * @return
     */
    @Override
    public int deleteLogininforByIds(Long[] infoIds) {
        return baseMapper.deleteBatchIds(Arrays.asList(infoIds));
    }

    /**
     * 清空系统登录日志
     */
    @Override
    public void cleanLogininfor() {
        remove(new LambdaQueryWrapper<>());
    }
}
