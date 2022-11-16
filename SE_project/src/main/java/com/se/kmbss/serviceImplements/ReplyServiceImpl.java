package com.se.kmbss.serviceImplements;
import java.util.List;
import com.se.kmbss.dao.ReplyDAO;
import com.se.kmbss.model.ReplyVO;
import com.se.kmbss.service.ReplyService;

public class ReplyServiceImpl implements ReplyService{
    private ReplyDAO dao;
    
    public List<ReplyVO> readReply(int bno) throws Exception{
        return dao.readReply(bno);
    }
}
