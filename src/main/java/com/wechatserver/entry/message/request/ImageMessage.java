package com.wechatserver.entry.message.request;

/**
 * ClassName: ImageMessage
 * 
 * @Description: 图片消息
 */
public class ImageMessage extends BaseMessage {
	// 图片链接
	private String PicUrl;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

}
