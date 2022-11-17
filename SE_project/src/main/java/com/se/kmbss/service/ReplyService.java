package com.se.kmbss.service;
import java.util.List;
import com.se.kmbss.model.ReplyVO;

public interface ReplyService {
    public List<ReplyVO> readReply(int bno) throws Exception;
}
