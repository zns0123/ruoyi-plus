package net.ptnetwork.court.mapper;

import net.ptnetwork.court.domain.LawCase;
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
public interface LawCaseMapper extends BaseMapper<LawCase> {

    // 获取案件列表
    List<LawCase> GetCase();

    // 查询案件（根据案件名模糊查询）
    List<LawCase> QueryCase(LawCase lawCase);

    // 查看案件详情（根据案件名查询）
    List<LawCase> SelectCase(LawCase lawCase);

}
