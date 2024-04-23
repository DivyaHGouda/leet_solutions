/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteMiddle(struct ListNode* head) {
    struct ListNode* temp=head;
    if(head->next==NULL)
    return NULL;
    int n=0;
    while(temp!=NULL){
        temp=temp->next;
        n++;
    }
    int k=0;
    k=(n/2)+1;
    printf("%d",k);
    int j=1;
    temp=head;
    if(k==n){
        head->next=NULL;
        return head;
    }
    while(j<k-1){
        temp=temp->next;
        j++;
    }
    if(temp->next->next==NULL){
        temp->next=NULL;
    }
    else{
        temp->next=temp->next->next;
    }
    return head;
}