function loadPage() {
    const url = `/members/`;
    fetch(url)
        .then(response => response.json())
            .then(data => {
                const membersBody = document.getElementById('membersBody');
                membersBody.innerHTML = ''; // Clear existing content
                let id = 1;
                data.forEach(member => {
                    const row = document.createElement('tr');
                    row.innerHTML = `
                        <td>${id}</td>
                        <td>${member.name}</td>
                        <td>${member.email}</td>
                        <td>${member.age}</td>
                        <td>${member.plan.planName}</td>
                        <td class="${member.status ? '' : 'inactive'}">${member.status ? 'Active' : 'Inactive'}</td>
                    `;
                    membersBody.appendChild(row);
                    id++;
                });
            })
            .catch(error => console.error('Error fetching members:', error));
        };

function addMember(){
    const addMember = document.getElementById("addMemberButton");
    if(addMember){
        addMember.addEventListener("click", function(){
            window.location.href = "Add.html";
        });
    }
}

document.addEventListener('DOMContentLoaded', () => {
    loadPage(); 
    addMember();
});