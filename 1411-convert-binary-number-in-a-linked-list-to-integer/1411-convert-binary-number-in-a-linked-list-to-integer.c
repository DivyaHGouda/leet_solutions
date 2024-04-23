/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int getDecimalValue(struct ListNode* head) {
    int n=0;
    struct ListNode* temp=head;
    while(temp!=NULL){
        n++;
        temp=temp->next;
    }
    int num=0;
    temp=head;
    while(temp!=NULL){
        num=num+temp->val*pow(2,n-1);
        n--;
        temp=temp->next;
    }
    return num;
}