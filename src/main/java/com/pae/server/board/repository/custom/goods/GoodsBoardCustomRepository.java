package com.pae.server.board.repository.custom.goods;

import com.pae.server.board.dto.request.GoodsQueryCond;
import com.pae.server.board.dto.response.GoodsBoardSimpleInfoDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GoodsBoardCustomRepository {

    /***
     * 거래 게시판 전체 목록 조회
     */
    Page<GoodsBoardSimpleInfoDto> queryGoods(
            Pageable pageable,
            GoodsQueryCond goodsQueryCond
    );

    /***
     * 찜한 거래 게시판 목록 조회
     * @return
     */
    Page<GoodsBoardSimpleInfoDto> queryLikeGoods(
            Pageable pageable,
            Long queryMemberId
    );
}
