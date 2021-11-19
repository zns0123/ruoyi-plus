package net.ptnetwork.court.mapper;

import net.ptnetwork.court.domain.Signature;
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
public interface SignatureMapper extends BaseMapper<Signature> {

    // 获取签章列表
    List<Signature> GetSignature();

    // 选择并查看签章详情（根据签章id查询）
    List<Signature> SelectSignature(Signature signature);

}
