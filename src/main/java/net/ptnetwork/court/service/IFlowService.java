package net.ptnetwork.court.service;

import net.ptnetwork.court.domain.Flow;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Collection;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author cyh
 * @date 2021-11-10
 */
public interface IFlowService extends IService<Flow> {

    // 获取流程日志列表
    List<Flow> GetFlow();

}
