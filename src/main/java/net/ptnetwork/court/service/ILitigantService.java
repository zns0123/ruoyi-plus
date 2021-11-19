package net.ptnetwork.court.service;

import net.ptnetwork.court.domain.Litigant;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Collection;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author cyh
 * @date 2021-11-10
 */
public interface ILitigantService extends IService<Litigant> {

    // 展示当事人信息（通过案号）
    List<Litigant> ShowLitigant(Litigant litigant);

}
