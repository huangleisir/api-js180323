package com.jst.prodution.reward.common.dto.resp;



import java.util.List;

import com.jst.prodution.reward.common.dto.XGenericResponseDTO;

public class PageResponseDTO<T> extends XGenericResponseDTO {

	private static final long serialVersionUID = -8856430258357808940L;
	
	private Long total;
    private int pageNo;
    private int pageSize;
    private int pageCount;
    private List<T> dataList;

//    public PageResponseDTO(String reqSn, String respCode, String respMsg, PageResult<T> pageResult) {
//        super(reqSn, respCode, respMsg);
//        total = String.valueOf(pageResult.getTotal());
//        pageNo = String.valueOf(pageResult.getPageCount());
//        pageCount = String.valueOf(pageResult.getPageCount());
//        pageSize = String .valueOf(pageResult.getPageSize());
//        dataList = pageResult.getDataList();
//    }
    
    public PageResponseDTO() {
    }

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

  
}
