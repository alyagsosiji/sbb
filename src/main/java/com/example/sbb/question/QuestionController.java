package com.example.sbb.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class QuestionController {

    // lombok --> @RequiredArgsConstructor 사용하면 의존성주입 (DI) --> new 객체 생성 안해도 됨
    private final QuestionRepository questionRepository;

    @GetMapping("/question/list")
    public String list(Model model) {
        List<Question> questionList = this.questionRepository.findAll();

        // 중요 --> "questionList" 라는 이름이 html의 ${questionList}와 연결됨
        model.addAttribute("questionList", questionList);
        return "question_list";  // question_list.html  리턴 됨
    }
}
