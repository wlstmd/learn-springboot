package com.example.simple_board.reply.controller;

import com.example.simple_board.reply.db.ReplyEntity;
import com.example.simple_board.reply.model.ReplyRequest;
import com.example.simple_board.reply.service.ReplyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reply")
@RequiredArgsConstructor
public class ReplyController {
    private final ReplyService replyService;
    @PostMapping("")

    public ReplyEntity create(@Valid @RequestBody ReplyRequest replyRequest) {
        return replyService.create(replyRequest);
    }
}
