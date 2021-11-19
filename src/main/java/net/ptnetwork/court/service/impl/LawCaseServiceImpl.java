package net.ptnetwork.court.service.impl;

import io.swagger.annotations.Api;
import net.ptnetwork.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.ptnetwork.court.domain.LawCase;
import net.ptnetwork.court.mapper.LawCaseMapper;
import net.ptnetwork.court.service.ILawCaseService;

import java.util.List;


/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author cyh
 * @date 2021-11-10
 */
@Service
public class LawCaseServiceImpl extends ServiceImpl<LawCaseMapper, LawCase> implements ILawCaseService {

    @Autowired
    private LawCaseMapper lawCaseMapper;

    // 获取案件列表
    @Override
    public List<LawCase> GetCase() {
        return lawCaseMapper.GetCase();
    }

    // 查询案件（根据案件名模糊查询）
    @Override
    public List<LawCase> QueryCase(LawCase lawCase) {
        return lawCaseMapper.QueryCase(lawCase);
    }

    // 查看案件详情（根据案件名查询）
    @Override
    public List<LawCase> SelectCase(LawCase lawCase) {
        return lawCaseMapper.SelectCase(lawCase);
    }
}
