package com.bw;

/**
 * @作者:赵路加
 * @时间:2019年8月9日
 */
public class StringUtil {

	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public boolean hasLength(String src){
		if(!src.equals("")&& src != null){
			return false;
		}
		return true;
	}
	
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public boolean hasTest(String src){
		if(!src.equals(" ")&& src != null && src.equals("")){
			return false;
		}
		return true;
	}
}
