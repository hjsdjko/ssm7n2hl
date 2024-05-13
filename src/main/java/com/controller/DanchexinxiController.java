package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DanchexinxiEntity;
import com.entity.view.DanchexinxiView;

import com.service.DanchexinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 单车信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
@RestController
@RequestMapping("/danchexinxi")
public class DanchexinxiController {
    @Autowired
    private DanchexinxiService danchexinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DanchexinxiEntity danchexinxi, HttpServletRequest request){

        EntityWrapper<DanchexinxiEntity> ew = new EntityWrapper<DanchexinxiEntity>();
		PageUtils page = danchexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, danchexinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DanchexinxiEntity danchexinxi, HttpServletRequest request){
        EntityWrapper<DanchexinxiEntity> ew = new EntityWrapper<DanchexinxiEntity>();
		PageUtils page = danchexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, danchexinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DanchexinxiEntity danchexinxi){
       	EntityWrapper<DanchexinxiEntity> ew = new EntityWrapper<DanchexinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( danchexinxi, "danchexinxi")); 
        return R.ok().put("data", danchexinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DanchexinxiEntity danchexinxi){
        EntityWrapper< DanchexinxiEntity> ew = new EntityWrapper< DanchexinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( danchexinxi, "danchexinxi")); 
		DanchexinxiView danchexinxiView =  danchexinxiService.selectView(ew);
		return R.ok("查询单车信息成功").put("data", danchexinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DanchexinxiEntity danchexinxi = danchexinxiService.selectById(id);
        return R.ok().put("data", danchexinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DanchexinxiEntity danchexinxi = danchexinxiService.selectById(id);
        return R.ok().put("data", danchexinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DanchexinxiEntity danchexinxi, HttpServletRequest request){
    	danchexinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(danchexinxi);

        danchexinxiService.insert(danchexinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DanchexinxiEntity danchexinxi, HttpServletRequest request){
    	danchexinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(danchexinxi);

        danchexinxiService.insert(danchexinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DanchexinxiEntity danchexinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(danchexinxi);
        danchexinxiService.updateById(danchexinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        danchexinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DanchexinxiEntity> wrapper = new EntityWrapper<DanchexinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = danchexinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
