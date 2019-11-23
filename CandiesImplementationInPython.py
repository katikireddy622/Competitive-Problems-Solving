from collections import Counter

def solution(T):
    give = len(a)/2
    answer = 0

    counter = Counter(a)
    for k,v in counter.items():
        while v > 1 and give >= 0:
            v = v-1
            give = give-1
            counter[k]=v
        answer = len(counter.keys())
        
    if give == 0:
        return answer

    if give > 0:
        answer = len(counter.keys())-give
        return (answer)
