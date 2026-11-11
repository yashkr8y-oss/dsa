class Node:
    def __init__(self, value):
        self.data = value
        self.next = None
class LinkedLists:
    def __init__(self):
        self.head = None
        self.n = 0
    def __len__(self):
        return self.n
    def insertHead(self,value):
        new_node = Node(value)
        self.new_node = self.head
        new_node = self.head
        self.n = self.n+1
l = LinkedLists()
len(l)
print(len(l))
l.insertHead(1)
l.insertHead(2)
l.insertHead(3)
l.insertHead(4)
l.insertHead(5)
print(len(l))

    def tarverse(self):
        curr = self.head
        while curr != None:
            print(curr.next)
            curr = curr.next
            


