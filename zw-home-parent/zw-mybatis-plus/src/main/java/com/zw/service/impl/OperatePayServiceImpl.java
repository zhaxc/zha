package com.zw.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zw.entity.OperatePay;
import com.zw.mapper.OperatePayMapper;
import com.zw.service.IOperatePayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 经营支付 服务实现类
 * </p>
 *
 * @author zha
 * @since 2017-07-25
 */
@Service
public class OperatePayServiceImpl extends ServiceImpl<OperatePayMapper, OperatePay> implements IOperatePayService {

    @Autowired
    private OperatePayMapper operatePayMapper;

    @Override
    public void batchInsert(List<OperatePay> operatePays) {

        int limit = 10000;//限制条数

        if (!operatePays.isEmpty()) {

            Integer size = operatePays.size();
            //判断是否有必要分批
            if (limit < size) {
                int part = size / limit;//分批数
                for (int i = 0; i < part; i++) {
                    List<OperatePay> listPage = operatePays.subList(0, limit);
                    operatePayMapper.batchInsert(listPage);
                    //剔除
                    operatePays.subList(0, limit).clear();
                }
                if (!operatePays.isEmpty()) {
                    operatePayMapper.batchInsert(operatePays);
                }
            } else {
                operatePayMapper.batchInsert(operatePays);
            }
        }

    }
}
