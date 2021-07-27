package com.ssafy.api.response;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.ssafy.db.entity.Concert;
import com.ssafy.db.entity.UserConcert;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 공연 상세 정보 조회 API ([GET] /api/v1/concert/{concertId}) 요청에 대한 응답값 정의.
 */
@Getter
@Setter
@ApiModel("DetailConcertResponse")
public class ConcertDetailRes{
	@ApiModelProperty(name="ID")
	Long id;
	@ApiModelProperty(name="Category")
	String category;
	@ApiModelProperty(name="Owner Name")
	String owner;
	@ApiModelProperty(name="StartTime")
	String startTime;
	@ApiModelProperty(name="EndTime")
	String endTime;
	@ApiModelProperty(name="ThumbnailUrl")
	String thumbnailUrl;
	@ApiModelProperty(name="Title")
	String title;
	@ApiModelProperty(name="Decription")
	String decription;
	@ApiModelProperty(name="IsActive")
	Boolean isActive;
	@ApiModelProperty(name="Users")
	List<ConcertUserDetailRes> users;

	public static ConcertDetailRes of(Optional<Concert> concert, Optional<List<UserConcert>> userConcerts) {
		ConcertDetailRes res = new ConcertDetailRes();
		List<ConcertUserDetailRes> userResList = getUserRes(userConcerts);
		res.setId(concert.get().getId());
		res.setCategory(concert.get().getCategory().getName());
		res.setOwner(concert.get().getUser().getName());
		res.setStartTime(concert.get().getStartTime());
		res.setEndTime(concert.get().getEndTime());
		res.setThumbnailUrl(concert.get().getThumbnail().getPath());
		res.setTitle(concert.get().getTitle());
		res.setDecription(concert.get().getDescription());
		res.setIsActive(concert.get().getIsActive());
		res.setUsers(userResList);
		return res;
	}

	private static List<ConcertUserDetailRes> getUserRes(Optional<List<UserConcert>> userConcerts) {		
		List<ConcertUserDetailRes> res = new ArrayList<ConcertUserDetailRes>();
		for(UserConcert uc : userConcerts.get()) {
			ConcertUserDetailRes user = new ConcertUserDetailRes();
			user.setUserId(uc.getUser().getUserId());
			user.setUserName(uc.getUser().getName());
			res.add(user);
		}
		return res;
	}
}