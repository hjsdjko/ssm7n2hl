package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HaichedingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HaichedingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HaichedingdanView;


/**
 * 还车订单
 *
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
public interface HaichedingdanService extends IService<HaichedingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HaichedingdanVO> selectListVO(Wrapper<HaichedingdanEntity> wrapper);
   	
   	HaichedingdanVO selectVO(@Param("ew") Wrapper<HaichedingdanEntity> wrapper);
   	
   	List<HaichedingdanView> selectListView(Wrapper<HaichedingdanEntity> wrapper);
   	
   	HaichedingdanView selectView(@Param("ew") Wrapper<HaichedingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HaichedingdanEntity> wrapper);
   	
}

