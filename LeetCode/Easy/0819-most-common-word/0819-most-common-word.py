class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        words = [word for word in re.sub(r'[^\w]',' ',paragraph)
            .lower().split()
                if word not in banned]

        # 3rd solve
        counts = collections.Counter(words)
        return counts.most_common(1)[0][0]


        # 2nd solve
        # counts = collections.defaultdict(int)
        # for word in words:
        #     counts[word] += 1
        
        # return max(counts, key=counts.get)

        # 1st solve
        # words_dic = {}

        # for word in words:
        #     if word in words_dic:
        #         words_dic[word] += 1
        #     else:
        #         words_dic[word] = 1

        # most_word = ''
        # max_count = 0
        
        # for word, count in words_dic.items():
        #     if(count > max_count):
        #         max_count = count
        #         most_word = word

        # return most_word