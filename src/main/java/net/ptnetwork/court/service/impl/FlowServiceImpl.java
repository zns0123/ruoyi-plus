package net.ptnetwork.court.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.ptnetwork.court.domain.Flow;
import net.ptnetwork.court.mapper.FlowMapper;
import net.ptnetwork.court.service.IFlowService;

import java.util.List;


/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author cyh
 * @date 2021-11-10
 */
@Service
public class FlowServiceImpl extends ServiceImpl<FlowMapper, Flow> implements IFlowService {

    @Autowired
    private FlowMapper flowMapper;

    // 获取流程日志列表
    @Override
    public List<Flow> GetFlow() {
        return flowMapper.GetFlow();
    }
}
