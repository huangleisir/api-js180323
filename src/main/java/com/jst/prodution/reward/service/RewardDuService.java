/**
 * 
 */
package com.jst.prodution.reward.service;

import com.jst.prodution.base.service.BaseService;
import com.jst.prodution.reward.common.dto.req.RQ0001ReqDto;
import com.jst.prodution.reward.common.dto.req.RQ0002ReqDto;
import com.jst.prodution.reward.common.dto.req.RQ0003ReqDto;
import com.jst.prodution.reward.common.dto.req.RQ0004ReqDto;
import com.jst.prodution.reward.common.dto.req.RQ0005ReqDto;
import com.jst.prodution.reward.common.dto.req.RQ0006ReqDto;
import com.jst.prodution.reward.common.dto.req.RQ0011ReqDto;
import com.jst.prodution.reward.common.dto.req.RQ0012ReqDto;
import com.jst.prodution.reward.common.dto.req.RQ0013ReqDto;
import com.jst.prodution.reward.common.dto.req.RT0001ReqDto;
import com.jst.prodution.reward.common.dto.req.RT0002ReqDto;
import com.jst.prodution.reward.common.dto.req.RT0003ReqDto;
import com.jst.prodution.reward.common.dto.resp.PageResponseDTO;
import com.jst.prodution.reward.common.dto.resp.RQ0002RespDto;
import com.jst.prodution.reward.common.dto.resp.RQ0003RespDto;
import com.jst.prodution.reward.common.dto.resp.RQ0004RespDto;
import com.jst.prodution.reward.common.dto.resp.RQ0005RespDto;
import com.jst.prodution.reward.common.dto.resp.RQ0006RespDto;
import com.jst.prodution.reward.common.dto.resp.RQ0011RespDto;
import com.jst.prodution.reward.common.dto.resp.RQ0012RespDto;
import com.jst.prodution.reward.common.dto.resp.RQ0013RespDto;
import com.jst.prodution.reward.common.dto.resp.RT0001RespDto;
import com.jst.prodution.reward.common.dto.resp.RT0002RespDto;
import com.jst.prodution.reward.common.dto.resp.RT0003RespDto;
import com.jst.prodution.reward.serviceBean.IncentiveRecord;

/**
 * 
 * 
 * @Package: com.jst.prodution.framework.service  
 * @ClassName: TestDuService 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年7月25日 上午9:36:41 
 * @version V1.0
 */
public interface RewardDuService extends BaseService{
	
	
	
	
	/**
	 * 查询是否签到
	* @Title: queryIsSignInDone
	* @Description: 查询是否签到
	* @param @param userId
	* @param @return    参数
	* @return boolean  state 1是已经签到 0没有签到
	* @throws
	 */
	public RQ0002RespDto queryIsSignInDone(RQ0002ReqDto dto);

	/**
	 * 
	* @Title: queryIsShare
	* @Description: 是否已经分享
	* @param @param dto
	* @param @return    参数
	* @return RQ0003RespDto.state 1是已经分享0是没有分享   
	* @throws
	 */
	public RQ0003RespDto queryIsShare(RQ0003ReqDto dto);

	
	/**   
	 * @Title: queryUserLevelConfigs   
	 * @Description: 查询用户激励等级配置
	 * @param: @param RQ0005ReqDto
	 * @param: @return      
	 * @return: RQ0005RespDto      
	 * @throws   
	 */  
	public RQ0005RespDto queryUserLevelConfigs(RQ0005ReqDto RQ0005ReqDto);
	
	/**   
	 * @Title: queryUserLevel   
	 * @Description:查询会员当前激励等级状态
	 * @param: @param RQ0006ReqDto
	 * @param: @return      
	 * @return: RQ0006RespDto      
	 * @throws   
	 */  
	public RQ0006RespDto queryUserLevel(RQ0006ReqDto RQ0006ReqDto);
	
	
	
	/**   
	 * @Title: signIn   
	 * @Description: 签到
	 * @param: @param RT0001ReqDto
	 * @param: @return      
	 * @return: RT0001RespDto      
	 * @throws   
	 */  
	public RT0001RespDto signIn(RT0001ReqDto RT0001ReqDto);
	
	/**   
	 * @Title: signIn   
	 * @Description: 分享
	 * @param: @param RT0002ReqDto
	 * @param: @return      
	 * @return: RT0002RespDto      
	 * @throws   
	 */  
	public RT0002RespDto share(RT0002ReqDto RT0002ReqDto);
	
	
	/**
	 * 
	* @Title: queryShareAppScore
	* @Description: 查询分享所得的好豆值
	* @param @param dto
	* @param @return    参数
	* @return RQ00011RespDto.CommonConfiguration对象
	* @throws
	 */
	public RQ0011RespDto queryShareAppScore(RQ0011ReqDto dto);
	
	/**
	 * 
	* @Title: querySignInScore
	* @Description: 查询今日是否签到对应的显示分数
	* @param @param RQ0012ReqDto.userId
	* @param @return    参数
	* @return RQ0012RespDto.score分数和 RQ0012RespDto.state的状态
	* @throws
	 */
	public RQ0012RespDto querySignInScore(RQ0012ReqDto dto);
	
	/**
	 * 
	* @Title: getIncentiveRecordPage
	* @Description: 分页查询好豆明细
	* @param @param dto
	* @param @return    参数
	* @return PageResponseDTO<IncentiveRecord>    返回类型
	* @throws
	 */
	public PageResponseDTO<IncentiveRecord> getIncentiveRecordPage(RQ0001ReqDto dto);


	public RQ0004RespDto getSigninConfigurationList(RQ0004ReqDto dto);
	
	/**
	 * 
	* @Title: queryAccountInfo
	* @Description: 查询账户好豆总数
	* @param @param dto.userId 账户id  dto.accountType 账户类型
	* @param @return    参数
	* @return RQ0013RespDto    返回类型
	* @throws
	 */
	public RQ0013RespDto queryAccountInfo(RQ0013ReqDto dto);
	
	
	public RT0003RespDto updateUserPopUp(RT0003ReqDto dto);

	PageResponseDTO<IncentiveRecord> selectRewardRecord(RQ0001ReqDto RQ0001ReqDto);

}