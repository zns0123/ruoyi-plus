package net.ptnetwork.court.service;

import net.ptnetwork.common.core.domain.AjaxResult;
import net.ptnetwork.court.domain.LawCase;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Collection;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author cyh
 * @date 2021-11-10
 */
public interface ILawCaseService extends IService<LawCase> {

    // 获取案件列表
    List<LawCase> GetCase();

    // 查询案件（根据案件名模糊查询）
    List<LawCase> QueryCase(LawCase lawCase);

    // 查看案件详情（根据案件名查询）
    List<LawCase> SelectCase(LawCase lawCase);

}
