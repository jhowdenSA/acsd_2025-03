import re


def answer(question):
    # question_list = re.split(r' \?', question)
    question = question.replace("What is ", "")
    question = question.replace("?", "")
    question_list = question.split()
    if "plus" in question_list:
        i = question_list.index("plus")
        return int(question_list[i-1]) + int(question_list[i+1])
    else:
        return int(question[0])
    # elif "minus" in question_list:
    #     i = question_list.index("minus")