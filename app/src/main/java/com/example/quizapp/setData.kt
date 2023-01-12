package com.example.quizapp

object setData {

        const val name: String = "name"
        const val score: String = "score"


    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "Além de patrulhar rodovias federais,o que mais compete a Polícia Rodoviária Federal no âmbito das rodovias federais?",
            "Executar obras",
            "Fazer o salvamento e socorro devítimas",
            "Julgar recursos",
            "Emitir documentos",
            2

        )
        var question2 = QuestionData(
            2,
            "40 km/h é a velocidade mínima para qual via urbana não sinalizada?",
            "Coletora",
            "Rodovia",
            "Trânsito rápido",
            "Arterial",
            3
        )
        var question3 = QuestionData(
            3,
            "A sinalização que tem como função informar o usuário da via sobre restrições, obrigações, condições do uso da via.",
            "Indicação",
            "Regulamentação",
            "Horizontal",
            "Advertência",
            2
        )
        var question4 = QuestionData(
            2,
            "Compete manter e organiza o Renach e o Renavam:",
            "Contran",
            "Detran",
            "PRF",
            "Denatran",
            4
        )
        var question5 = QuestionData(
            2,
            "Para conduzir um trator em via pública qual categoria exigida?",
            "B, C ou D",
            "AB, A ou D",
            "D, B ou E",
            "C, D ou E",
            4
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que
    }
}