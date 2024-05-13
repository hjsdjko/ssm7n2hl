package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZulinfeiyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZulinfeiyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZulinfeiyongView;


/**
 * 租赁费用
 *
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
public interface ZulinfeiyongService extends IService<ZulinfeiyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZulinfeiyongVO> selectListVO(Wrapper<ZulinfeiyongEntity> wrapper);
   	
   	ZulinfeiyongVO selectVO(@Param("ew") Wrapper<ZulinfeiyongEntity> wrapper);
   	
   	List<ZulinfeiyongView> selectListView(Wrapper<ZulinfeiyongEntity> wrapper);
   	
   	ZulinfeiyongView selectView(@Param("ew") Wrapper<ZulinfeiyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZulinfeiyongEntity> wrapper);
   	
}

