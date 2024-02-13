'use client'
import { useState } from "react";
import { signIn } from 'next-auth/react';
import Link from "next/link";


const SignInPage = () => {
  const [formData, setFormData] = useState({ email: "", password: "" });

  const handleInputChange = (e: { target: { name: any; value: any; }; }) => setFormData({ ...formData, [e.target.name]: e.target.value });

  const handleLogin = async () => {
    try {

       await signIn('credentials', { ...formData, redirect: true,callbackUrl: "/dashboard", });
    } catch (error) {
      console.error('Login failed', error);
      alert('Login failed. Please try again.');
    }
  };

  return (
    <div className="m-2 border rounded overflow-hidden shadow">
      <div className="p-2 bg-gradient-to-b from-white to-slate-200 text-slate-600">Login</div>
      <div className="p-2 flex flex-col gap-6">
        <input name="email" placeholder="Email" value={formData.email} required onChange={handleInputChange} />
        <input name="password" placeholder="Password" type="password" value={formData.password} required onChange={handleInputChange} />
        <div className="flex justify-center items-center gap-2">
          <button onClick={handleLogin}>Login</button>
          <Link className="" href={"/"}>Cancel</Link>
        </div>
      </div>
    </div>
  );
};

export default SignInPage;
