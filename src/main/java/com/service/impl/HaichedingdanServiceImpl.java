package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HaichedingdanDao;
import com.entity.HaichedingdanEntity;
import com.service.HaichedingdanService;
import com.entity.vo.HaichedingdanVO;
import com.entity.view.HaichedingdanView;

@Service("haichedingdanService")
public class HaichedingdanServiceImpl extends ServiceImpl<HaichedingdanDao, HaichedingdanEntity> implements HaichedingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HaichedingdanEntity> page = this.selectPage(
                new Query<HaichedingdanEntity>(params).getPage(),
                new EntityWrapper<HaichedingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HaichedingdanEntity> wrapper) {
		  Page<HaichedingdanView> page =new Query<HaichedingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HaichedingdanVO> selectListVO(Wrapper<HaichedingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HaichedingdanVO selectVO(Wrapper<HaichedingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HaichedingdanView> selectListView(Wrapper<HaichedingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HaichedingdanView selectView(Wrapper<HaichedingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
