/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode* temp=head;
    int n=0;
    while(temp!=NULL){
        temp=temp->next;
        n++;
    }
    int k=(n/2)+1;
    int j=0;
    temp=head;
    while(j<k){
        if(head==NULL || temp==NULL)
        return head;
        head=temp;
        temp=temp->next;
        j++;
    }
    return head;
}