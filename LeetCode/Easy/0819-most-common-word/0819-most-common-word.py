class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        words = [word for word in re.sub(r'[^\w]',' ',paragraph)
            .lower().split()
                if word not in banned]


        words_dic = {}

        for word in words:
            if word in words_dic:
                words_dic[word] += 1
            else:
                words_dic[word] = 1

        most_word = ''
        max_count = 0
        
        for word, count in words_dic.items():
            if(count > max_count):
                max_count = count
                most_word = word

        return most_word