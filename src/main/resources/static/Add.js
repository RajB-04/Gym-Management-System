document.getElementById("addMemberForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent form from refreshing the page

    const data = {
        name: document.getElementById('name').value,
        age: parseInt(document.getElementById('age').value),
        plan: {
            planId: parseInt(document.getElementById('plan').value)
        },
        gymGoal: {
            goalId: parseInt(document.getElementById('gymGoal').value)
        },
        status: document.getElementById('status').checked,
        phoneno: parseInt(document.getElementById('phoneno').value),
        email: document.getElementById('email').value,
        address: document.getElementById('address').value
    };

    fetch("/members/add", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    })
    .then(response => {
        if (!response.ok) throw new Error("Failed to add member");
        return response.json(); // Only if your backend returns something
    })
    .then(data => {
        alert("Member added successfully!");
        console.log(data);
        window.location.href = "home.html"; // Redirect or update UI
    })
    .catch(error => {
        console.error("Error:", error);
        alert("Failed to add member");
    });
});
