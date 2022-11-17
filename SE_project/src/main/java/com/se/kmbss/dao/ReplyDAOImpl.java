package com.se.kmbss.dao;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

import com.se.kmbss.model.ReplyVO;

public class ReplyDAOImpl implements ReplyDAO{
    SqlSession sql;
    
    @Override
    public List<ReplyVO> readReply(int bno) throws Exception {
        return sql.selectList("replyMapper.readReply",bno);
    }
}