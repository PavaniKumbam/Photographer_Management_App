function openMessage(btn){
  const id = btn.getAttribute('data-id');
  document.getElementById('msgPhotographerId').value = id;
  const modal = new bootstrap.Modal(document.getElementById('messageModal'));
  modal.show();
}

function openSchedule(btn){
  const id = btn.getAttribute('data-id');
  document.getElementById('schPhotographerId').value = id;
  const modal = new bootstrap.Modal(document.getElementById('scheduleModal'));
  modal.show();
}

document.getElementById('messageForm').addEventListener('submit', async (e) => {
  e.preventDefault();
  const id = document.getElementById('msgPhotographerId').value;
  const msg = document.getElementById('msgText').value;
  await fetch('/api/message', {method:'POST', headers:{'Content-Type':'application/x-www-form-urlencoded'}, body: new URLSearchParams({photographerId:id, message:msg})});
  bootstrap.Modal.getInstance(document.getElementById('messageModal')).hide();
  alert('Message sent!');
  e.target.reset();
});

document.getElementById('scheduleForm').addEventListener('submit', async (e) => {
  e.preventDefault();
  const id = document.getElementById('schPhotographerId').value;
  const dt = document.getElementById('schDateTime').value;
  await fetch('/api/schedule', {method:'POST', headers:{'Content-Type':'application/x-www-form-urlencoded'}, body: new URLSearchParams({photographerId:id, dateTime:dt})});
  bootstrap.Modal.getInstance(document.getElementById('scheduleModal')).hide();
  alert('Scheduled!');
  e.target.reset();
});