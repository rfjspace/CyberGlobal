package com.wechatserver.entry.message.request;

/**
 * ClassName: VideoMessage
 * 
 * @Description: 视频/小视屏消息
 */
public class VideoMessage extends BaseMessage{
	// 视频消息媒体 id，可以调用多媒体文件下载接口拉取数据
	private String MediaId; 
	// 视频消息缩略图的媒体 id，可以调用多媒体文件下载接口拉取数据
	private String ThumbMediaId; 

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}
}
